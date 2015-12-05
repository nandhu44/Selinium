package macys;

import org.testng.annotations.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import framework.Commonmethods;
import framework.Sehelper;
import framework.testreport;
import com.task.macys.Homepage;
import com.task.macys.Addtocartpage;
import com.task.macys.Cartpage;
import com.task.macys.Checkoutpage;
import com.task.macys.Searchresultspage;
import com.task.macys.Shippingpage;
import com.task.macys.Billingpage;
import com.task.macys.Orderreviewpage;

@SuppressWarnings("unused")
public class Smoketest {
	@SuppressWarnings("static-access")
	public static Sehelper chrom = new Sehelper();
	public static Addtocartpage add = new Addtocartpage();
	public static Cartpage cart = new Cartpage();
	public static Checkoutpage chkout = new Checkoutpage();
	public static Searchresultspage search = new Searchresultspage();
	public static Homepage home = new Homepage();
	public static Shippingpage ship = new Shippingpage();
	public static Billingpage bill = new Billingpage();
	public static Orderreviewpage review = new Orderreviewpage();
	public static Commonmethods common = new Commonmethods();
	public static testreport report;

	@BeforeMethod
	public void BeforeMethod() {
		chrom.chrome();
	}

	/*@Test
	public void test01() {
		home.geturl();
		String hme = common.getdata("home");
		String bbs = common.getdata("BB");
		String womens = common.getdata("women");
		String mens = common.getdata("men");
		String jun = common.getdata("juniors");
		String kid = common.getdata("kids");
		String act = common.getdata("active");
		String beauti = common.getdata("beauty");
		String shoe = common.getdata("shoes");
		String handbag = common.getdata("handbags");
		String jewlry = common.getdata("jew");
		String watch = common.getdata("watches");
		String brand = common.getdata("brands");
		home.validateallmenuitems(hme, bbs, womens, mens, jun, kid, act, beauti, shoe, handbag, jewlry, watch, brand);
		home.search();
		String shirt = common.getdata("itemname");
		String shirt_color = common.getdata("color");
		String shirt_size = common.getdata("size");
		search.itemselection(shirt, shirt_color, shirt_size);
		cart.validateitem(shirt, shirt_color, shirt_size);
	}

	@Test
	public void test02() {
		home.geturl();
		home.search();
		String shirt = common.getdata("itemname");
		String shirt_color = common.getdata("color");
		String shirt_size = common.getdata("size");
		search.itemselection(shirt, shirt_color, shirt_size);
		cart.validateitem(shirt, shirt_color, shirt_size);
		add.addtolist();
		add.addtobag();
		cart.clickcheckout();
		 chkout.validateitem(shirt, shirt_color, shirt_size); 
		chkout.cartitemsvalidation();
	}

	@Test
	public void test03() {
		home.geturl();
		home.search();
		String shirt = common.getdata("itemname");
		String shirt_color = common.getdata("color");
		String shirt_size = common.getdata("size");
		search.itemselection(shirt, shirt_color, shirt_size);
		add.addtolist();
		add.addtobag();
		cart.clickcheckout();
		chkout.clickcheckout();
		String fname = common.getdata("firstname");
		String lname = common.getdata("lastname");
		String add = common.getdata("address");
		String citi = common.getdata("city");
		String stat = common.getdata("state");
		String zip = common.getdata("zipcode");
		String phone = common.getdata("phonenum");
		String msg1 = common.getdata("message1");
		String msg2 = common.getdata("message2");
		String msg3 = common.getdata("message3");
		ship.Entershippingdetails(fname, lname, add, citi, stat, zip, phone);
		ship.contbtn();
	}

	@Test
	public void test04() {
		home.geturl();
		home.search();
		String shirt = common.getdata("itemname");
		String shirt_color = common.getdata("color");
		String shirt_size = common.getdata("size");
		search.itemselection(shirt, shirt_color, shirt_size);
		add.addtolist();
		add.addtobag();
		cart.clickcheckout();
		chkout.clickcheckout();
		String fname = common.getdata("firstname");
		String lname = common.getdata("lastname");
		String add = common.getdata("address");
		String citi = common.getdata("city");
		String stat = common.getdata("state");
		String zip = common.getdata("zipcode");
		String phone = common.getdata("phonenum");
		String msg1 = common.getdata("message1");
		String msg2 = common.getdata("message2");
		String msg3 = common.getdata("message3");
		ship.Entershippingdetails(fname, lname, add, citi, stat, zip, phone);
		ship.Giftmessage(msg1, msg2, msg3);
		ship.contbtn();
	}
	@Test
	public void test05() {
		home.geturl();
		home.search();
		String shirt = common.getdata("itemname");
		String shirt_color = common.getdata("color");
		String shirt_size = common.getdata("size");
		search.itemselection(shirt, shirt_color, shirt_size);
		add.addtolist();
		add.addtobag();
		cart.clickcheckout();
		chkout.clickcheckout();
		String fname = common.getdata("firstname");
		String lname = common.getdata("lastname");
		String add = common.getdata("address");
		String citi = common.getdata("city");
		String stat = common.getdata("state");
		String zip = common.getdata("zipcode");
		String phone = common.getdata("phonenum");
		ship.Entershippingdetails(fname, lname, add, citi, stat, zip, phone);
		ship.contbtn();
		String ctype = common.getdata("cardtype");
		String cnum = common.getdata("cardnum");
		String em = common.getdata("expmonth");
		String ey = common.getdata("expyear");
		String cvv = common.getdata("cvvno");
		String mail = common.getdata("email");
		bill.Enterbillingdetails(ctype, cnum, em, ey, cvv, fname, lname, add, citi, stat, zip, phone, mail);
		review.validateshippingdetails();
	}*/
	@Test
	public void test06() {
	home.geturl();
	home.search();
	String shirt = common.getdata("itemname");
	String shirt_color = common.getdata("color");
	String shirt_size = common.getdata("size");
	search.itemselection(shirt, shirt_color, shirt_size);
	add.addtolist();
	add.addtobag();
	cart.clickcheckout();
	chkout.clickcheckout();
	String fname = common.getdata("firstname");
	String lname = common.getdata("lastname");
	String add = common.getdata("address");
	String citi = common.getdata("city");
	String stat = common.getdata("state");
	String zip = common.getdata("zipcode");
	String phone = common.getdata("phonenum");
	ship.Entershippingdetails(fname, lname, add, citi, stat, zip, phone);
	ship.contbtn();
	review.validateshippingdetails();
	review.editbtn();
    ship.Updateshippingdetails();
    
	}
}
