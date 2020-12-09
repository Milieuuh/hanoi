package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	/**
	 * GIVEN False
	 * WHEN tourPleine
	 */
	@Test
	public void testEmpiler_TourPleine_False() {
		Disque d1 = new Disque(1);
		Disque d2 = new Disque(2);

		Tour _TourPleine = new Tour(1);
		_TourPleine.empiler(d2);

		boolean expected = false ;
		boolean actual = _TourPleine.empiler(d1);

		assertEquals(expected, actual);

	}

	/**
	 * GIVEN TRUE
	 * WHEN TourNonVide avec disque de diamètre plus petit
	 */
	@Test
	public void testEmpiler_TourNonVideDisquePlusPetit_True() {
		Disque d1 = new Disque(1);
		Disque d2 = new Disque(2);

		Tour _TourNonVide = new Tour(2);
		_TourNonVide.empiler(d2);

		boolean expected = true ;
		boolean actual = _TourNonVide.empiler(d1);

		assertEquals(expected, actual);

	}
	/**
	 * GIVEN false
	 * WHEN ajout sur tour non vide un diamètre plus grand que celui en dessous
	 */
	@Test
	public void testEmpiler_TourNonVideDisquePlusGrand_False() {
		Disque d1 = new Disque(2);
		Disque d2 = new Disque(1);

		Tour _TourNonVide = new Tour(1);
		_TourNonVide.empiler(d2);
		boolean expected = false ;
		boolean actual = _TourNonVide.empiler(d1);

		assertEquals(expected, actual);

	}


	/**
	 * GIVEN TRUE
	 * WHEN Tour vide
	 */
	@Test
	public void testEmpiler_TourVide_True() {
		Disque d1 = new Disque(1);

		Tour _TourNonVide = new Tour(1);

		boolean expected = true ;
		boolean actual = _TourNonVide.empiler(d1);

		assertEquals(expected, actual);

	}



}
