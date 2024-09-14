//package com.example.demo;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//
//@Configuration
//public class FirebaseConfig {
//	 @Bean
//	    public FirebaseApp initializeFirebaseApp() throws IOException {
//	        FileInputStream serviceAccount =
//	                new FileInputStream("TomcatDemo\\Deploedtomcat\\src\\main\\resources\\google-services.json");
//
//	        FirebaseOptions options = new FirebaseOptions.Builder()
//	                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//	                .build();
//
//	        return FirebaseApp.initializeApp(options);
//	    }
//}
