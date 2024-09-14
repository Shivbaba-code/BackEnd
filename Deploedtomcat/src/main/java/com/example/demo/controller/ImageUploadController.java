package com.example.demo.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.ImageModel;
import com.example.demo.repository.ImageRepository;

@RestController

@RequestMapping("/api/v1/")
public class ImageUploadController {

	
	@Autowired
	ImageRepository imageRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	
	@PostMapping(value ="/uploadImages",  consumes=MediaType.ALL_VALUE ,produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	
	public ImageModel uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		
		System.out.println("Original Image Byte Size - " + file.getBytes().length);
		
//		ImageModel img = new ObjectMapper().readValue(compressBytes(file.getBytes()), ImageModel.class);
//		img.setName(file.getOriginalFilename());
//		img.setPicByte(file.getBytes());
//		img.setType(file.getContentType());
		
		ImageModel img = new ImageModel(file.getOriginalFilename(), file.getContentType(),compressBytes(file.getBytes()));
		//imageRepository.save(img);
		//return  ResponseEntity.status(org.springframework.http.HttpStatus.OK);
		return imageRepository.save(img);
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value ="/getImages/{id}")
   public List<ImageModel> getAllImageModel(@PathVariable("id") Long id) throws IOException{
	final Optional<ImageModel> retrievedImage = imageRepository.findById(id);
		ImageModel img = new ImageModel(retrievedImage.get().getName(), retrievedImage.get().getType(),
				decompressBytes(retrievedImage.get().getPicByte()));
		return imageRepository.findAll();
	}
//	public ImageModel getImage(@PathVariable("id") Integer id) throws IOException {
//
//		
//		
//		return img;
//	}
	
	
	public static byte[] compressBytes(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
		}
		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

		return outputStream.toByteArray();
	}
	
	public static byte[] decompressBytes(byte[] data) {
		Inflater inflater = new Inflater();
		inflater.setInput(data);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		try {
			while (!inflater.finished()) {
				int count = inflater.inflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			outputStream.close();
		} catch (IOException ioe) {
		} catch (DataFormatException e) {
		}
		return outputStream.toByteArray();
	}
}
