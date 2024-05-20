package ar.edu.info.unlp.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */

public class DeviceTest {
	Device device;

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	public void sendDataTest() {
		device = new Device();
		System.out.println(device.sendData("Mi mensaje"));
		device.changeCrcCalculator(new CRC32Calculator());
		device.changeConnection(new Conn4G());
		System.out.println(device.sendData("Mi mensaje"));
	}

	@Test
	public void sendDataCRC16Test() {
		device = new Device();
		assertEquals("Data sent: Mi mensaje with crc: 25828 using wifi", device.sendData("Mi mensaje"));
	}

	@Test
	public void sendDataCRC32Test() {
		device = new Device();
		device.changeCrcCalculator(new CRC32Calculator());
		assertEquals("Data sent: Mi mensaje with crc: 2272752560 using wifi", device.sendData("Mi mensaje"));
	}

}
