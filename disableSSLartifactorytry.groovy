import groovy.transform.*
import javax.net.ssl.SSLContext
import groovy.cli.commons.*

import java.net.http.*
import java.net.http.HttpRequest.BodyPublishers
import java.net.http.HttpResponse.BodyHandlers
import java.net.http.HttpResponse.BodyHandler
import java.util.concurrent.CompletableFuture

import java.nio.file.Paths

import javax.net.ssl.SSLContext;
//import javax.net.ssl.X509ExtendedKeyManager;
//import javax.net.ssl.X509ExtendedTrustManager;

HttpClient.Builder httpClientBuilder = HttpClient.newBuilder()

disableSSLVerify = true

 if ( disableSSLVerify ) {
      SSLContext sc = SSLContext.getInstance("SSL");
      sc.init(null, null, null);
      httpClientBuilder.sslContext(sc)
  } else {
  
      println("it is false")
  }