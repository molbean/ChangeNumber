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
	public void twentyと出力する() {
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual,is(expected));
	}


}
