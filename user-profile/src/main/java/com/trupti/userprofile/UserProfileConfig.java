package com.trupti.userprofile;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserProfileConfig {
	
	/*
	@Bean
	//@LoadBalanced
	RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.requestFactory(() -> validateSsl()).build();
	}
	*/
	@Bean
	@LoadBalanced
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	/*
	private HttpComponentsClientHttpRequestFactory disableSSl() {
		TrustStrategy acceptingTrustStrategy = new TrustStrategy() {
			
			@Override
			public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				return true;
			}
		};
		
		SSLContext sslContext = null;
		try {
				sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
			} catch (KeyManagementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (KeyStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		catch(NoSuchAlgorithmException e){
			
		}
		
		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext, new NoopHostnameVerifier());
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
		HttpComponentsClientHttpRequestFactory rf = new HttpComponentsClientHttpRequestFactory();
		rf.setHttpClient(httpClient);
		return rf;
	}*/
	
	/*
	 * @Value("${server.ssl.key-store}") private String LOCATION;
	 * 
	 * @Value("${server.ssl.key-password}") private String PASS;
	 * 
	 * @Value("${server.ssl.key-store-password}") private String STORE_PASS;
	 */
	/*
	private HttpComponentsClientHttpRequestFactory validateSsl() {
		
		String LOCATION = "C:/Users/trupt/Learn/Cert/ssl_trupti.jks";
		String PASS = "password";
		SSLContext sslContext = null;
		
		try {
			sslContext = SSLContextBuilder
					.create()
					.loadTrustMaterial(ResourceUtils.getFile(LOCATION), PASS.toCharArray())
					.build();
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException | CertificateException
				| IOException e) {
			e.printStackTrace();
		}
		
		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext, new LocalHostNameVerifier());
		CloseableHttpClient httpcClient = HttpClients.custom().setSSLSocketFactory(csf).build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpcClient);
		return requestFactory;		
	}
	
	private class LocalHostNameVerifier implements HostnameVerifier{

		@Override
		public boolean verify(String hostname, SSLSession session) {
			
			return "localhost".equalsIgnoreCase(hostname) || "127.0.0".equalsIgnoreCase(hostname);
		}
		
	}
*/
}
