package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Specialtie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNull;
import lombok.extern.slf4j.Slf4j;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class SpecialtyServiceTest {

	@Autowired
	private SpecialtieService specialtieService ;

	@Test
	public void testFindSpecialtieById() {
		String NAME_EXPECTED = "radiology";
		Integer ID = 1;
		Specialtie spe = null;
        spe = this.specialtieService.getSpecialtieById(ID);
        assertEquals(NAME_EXPECTED, spe.getName());
	}

	@Test
	public void testCreateSpe() {
		String PET_NAME = "Ponky";
		String OFFICE = "TestOffice";
		String hOPEN = "13";
		String hCLOSE = "15";
		Specialtie spe = new Specialtie(PET_NAME, OFFICE, hOPEN, hCLOSE);
		Specialtie speCreated = this.specialtieService.saveSpecialtie(spe);
		log.info("PET CREATED :" + speCreated.toString());
		assertNotNull(speCreated.getId());
		assertEquals(PET_NAME, speCreated.getName());
		assertEquals(hOPEN, speCreated.getHOpen());
		assertEquals(hCLOSE, speCreated.getHClose());
	}

	@Test
	public void testUpdateSpe() {
		String SPE_NAME = "dentistry";
		int SPE_ID = 1;

		String UP_SPE_NAME = "dentistry2";
		int UP_SPE_ID = 5;

		Specialtie spe = new Specialtie(SPE_NAME);

		// ------------ Create ---------------

		log.info(">" + spe);
		Specialtie newSpe = this.specialtieService.saveSpecialtie(spe);
		log.info(">>" + newSpe);

		// ------------ Update ---------------

		// Prepare data for update
		newSpe.setName(UP_SPE_NAME);

		// Execute update
		Specialtie upgradeSpe = this.specialtieService.saveSpecialtie(newSpe);
		log.info(">>>>" + upgradeSpe);

		//            EXPECTED        ACTUAL
		assertEquals(UP_SPE_NAME, upgradeSpe.getName());
	}

	/**
	 *
	 */
	@Test
	public void testDeleteSpe() {

		String SPE_NAME = "dentistry";

		// ------------ Create ---------------

		Specialtie spe = new Specialtie(SPE_NAME);
		spe = this.specialtieService.saveSpecialtie(spe);
		log.info("" + spe);

		// ------------ Delete ---------------

        this.specialtieService.deleteSpecialtie(spe.getId());

        // ------------ Validation ---------------

		Specialtie deleted = this.specialtieService.getSpecialtieById(spe.getId());
		assertNull(deleted);

	}

}

