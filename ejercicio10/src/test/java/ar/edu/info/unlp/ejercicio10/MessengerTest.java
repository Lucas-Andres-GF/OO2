package ar.edu.info.unlp.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */
public class MessengerTest {
	Messenger messenger;

	@BeforeEach
	void setUp() throws Exception {
		messenger = new Messenger();
	}

	@Test
	public void sendMessageTest() {
		String message = "Hola Mundo";
		String encryptedMessage = "Encrypted with RSA: " + message + " - " + message.length() + " characters";
		assertEquals(encryptedMessage, messenger.sendMessage(message));
		System.out.println(messenger.sendMessage(message));
		messenger.setStrategy(new BlowfishEncryptor());
		encryptedMessage = "Encrypted with Blowfish: " + message + " - " + message.length() + " characters";
		assertEquals(encryptedMessage, messenger.sendMessage(message));
		System.out.println(messenger.sendMessage(message));
	}

}
