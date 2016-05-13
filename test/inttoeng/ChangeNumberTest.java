package inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ChangeNumberTest {

	@Test
	public void oneと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	@Test
	public void twentyoneと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual,is(expected));
	}
	@Test
	public void eightynineと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "eighty nine";
		String actual = ite.translateEng(89);
		assertThat(actual,is(expected));
	}
	@Test
	public void thirtyと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "thirty";
		String actual = ite.translateEng(30);
		assertThat(actual,is(expected));
	}
	@Test
	public void onehundredと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual,is(expected));
	}
	@Test
	public void nineと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "nine hundred ninety nine";
		String actual = ite.translateEng(999);
		assertThat(actual,is(expected));
	}
	@Test
	public void threethousandと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "three thousand";
		String actual = ite.translateEng(3000);
		assertThat(actual,is(expected));
	}
	@Test
	public void eightytwohundredninetytwoと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "eighty two hundred ninety two";
		String actual = ite.translateEng(8292);
		assertThat(actual,is(expected));
	}
	@Test
	public void twelvehundredfiftyfourと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "twelve hundred fifty four";
		String actual = ite.translateEng(1254);
		assertThat(actual,is(expected));
	}
	@Test
	public void hundredoneと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred one";
		String actual = ite.translateEng(101);
		assertThat(actual,is(expected));
	}
	@Test
	public void onehundredtenと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred ten";
		String actual = ite.translateEng(110);
		assertThat(actual,is(expected));
	}
	@Test
	public void onehundredtwelveと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred twelve";
		String actual = ite.translateEng(112);
		assertThat(actual,is(expected));
	}
	@Test
	public void onehundredtwentyと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred twenty";
		String actual = ite.translateEng(120);
		assertThat(actual,is(expected));
	}
	@Test
	public void onehundrednineteenと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred eightteen";
		String actual = ite.translateEng(118);
		assertThat(actual,is(expected));
	}
	@Test
	public void threehundrednineteenと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "three hundred nineteen";
		String actual = ite.translateEng(319);
		assertThat(actual,is(expected));
	}
	@Test
	public void fivehundredfiveと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "five hundred five";
		String actual = ite.translateEng(505);
		assertThat(actual,is(expected));
	}
	@Test
	public void fivehundredninetyと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "five hundred ninety";
		String actual = ite.translateEng(590);
		assertThat(actual,is(expected));
	}
}
