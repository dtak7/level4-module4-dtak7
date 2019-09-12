package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EncapsulateTheDataTest {
	EncapsulateTheData capsule = new EncapsulateTheData();
	@Test
	void testItemsReceived() {
		capsule.setItemsReceived(-1);
		assertEquals(0, capsule.getItemsRecived());
		capsule.setItemsReceived(5);
		assertEquals(5, capsule.getItemsRecived());
		assertNotEquals(0, capsule.getItemsRecived());
	}
	@Test
	void testDegreesTurned() {
		capsule.setDegreesTurned(361);
		assertEquals(0, capsule.getDegreesTurned());
		capsule.setDegreesTurned(-5);
		assertEquals(360, capsule.getDegreesTurned());
		assertNotEquals(333, capsule.getDegreesTurned());
	}
	@Test
	void testNomenclature() {
		capsule.setNomenclature("");
		assertEquals(" ", capsule.getNomenclature());
		assertNotEquals("dooo", capsule.getNomenclature());
	}
	@Test
	void testObject() {
		capsule.setMemberObject("hi");
		Object test = capsule.getMemberObject();
		assertFalse(test instanceof String);
	}
}
