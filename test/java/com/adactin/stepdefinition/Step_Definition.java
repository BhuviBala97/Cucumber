package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.runner.Test_Runner;
import com.base_class.Base_Class;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	Page_Object_Manager ob = new Page_Object_Manager(driver);

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		String geturl = File_Reader_Manager.getinstance().getinstanceCR().geturl();
		driver.get(geturl);
		
	}

	@When("^user enter the username in username field$")
	public void user_enter_the_username_in_username_field() throws Throwable {
		sendkeyElement(ob.getinstanceLp().getUsername(), "Bhuvibala97");
	}

	@When("^user enter the password in password field$")
	public void user_enter_the_password_in_password_field() throws Throwable {
		sendkeyElement(ob.getinstanceLp().getPassword(), "75NQG1");
	}

	@Then("^user click on login button and it navigates the search hotel page$")
	public void user_click_on_login_button_and_it_navigates_the_search_hotel_page() throws Throwable {
		clickonElement(ob.getinstanceLp().getLogin());
	}

	@When("^user Select the location in location fields$")
	public void user_Select_the_location_in_location_fields() throws Throwable {
		dropDown_Element(ob.getinstancehp().getLocation(), "byindex", "2");
	}

	@When("^user Select the hotels in hotels fields$")
	public void user_Select_the_hotels_in_hotels_fields() throws Throwable {
		dropDown_Element(ob.getinstancehp().getHotels(), "byindex", "3");
	}

	@When("^user Select the Room Type in Room Type fields$")
	public void user_Select_the_Room_Type_in_Room_Type_fields() throws Throwable {
		dropDown_Element(ob.getinstancehp().getRoom_type(), "byindex", "2");
	}

	@When("^user Select the Number of Rooms in Number of Rooms fields$")
	public void user_Select_the_Number_of_Rooms_in_Number_of_Rooms_fields() throws Throwable {
		dropDown_Element(ob.getinstancehp().getRoom_nos(), "byindex", "2");
	}

	@When("^user enter the Check In Date in Check In Date fields$")
	public void user_enter_the_Check_In_Date_in_Check_In_Date_fields() throws Throwable {
		sendkeyElement(ob.getinstancehp().getDatepick_in(), "23/05/2021");
	}

	@When("^user enter the Check Out Date in Check Out Date fields$")
	public void user_enter_the_Check_Out_Date_in_Check_Out_Date_fields() throws Throwable {
		sendkeyElement(ob.getinstancehp().getDatepick_out(), "24/02/2022");
	}

	@When("^user Select the Adults per Room in Adults per Room fields$")
	public void user_Select_the_Adults_per_Room_in_Adults_per_Room_fields() throws Throwable {
		dropDown_Element(ob.getinstancehp().getAdult_room(), "byindex", "3");
	}

	@When("^user Select the Children per Room in Children per Room fields$")
	public void user_Select_the_Children_per_Room_in_Children_per_Room_fields() throws Throwable {
		dropDown_Element(ob.getinstancehp().getChild_room(), "byindex", "2");
	}

	@Then("^user click on the search button it navigates the select hotel page$")
	public void user_click_on_the_search_button_it_navigates_the_select_hotel_page() throws Throwable {
		clickonElement(ob.getinstancehp().getSubmit());
	}

	@Then("^user click on the select button$")
	public void user_click_on_the_select_button() throws Throwable {
		clickonElement(ob.getinstancesp().getradiobutton_0());
	}
	@Then("^user click on the continue button and it navigates the Book hotel page$")
	public void user_click_on_the_continue_button_and_it_navigates_the_Book_hotel_page() throws Throwable {
		clickonElement(ob.getinstancesp().getContinueElement());
	}

	@When("^user Enter the first name in First name fields$")
	public void user_Enter_the_first_name_in_First_name_fields() throws Throwable {
		sendkeyElement(ob.getinstancebk().getFirst_name(), "Bhuvanesh");
	}

	@When("^user Enter the last name in last name fields$")
	public void user_Enter_the_last_name_in_last_name_fields() throws Throwable {
		sendkeyElement(ob.getinstancebk().getLast_name(), "B");
	}

	@When("^user Enter the billing address in address fields$")
	public void user_Enter_the_billing_address_in_address_fields() throws Throwable {
		sendkeyElement(ob.getinstancebk().getAddress(), "qwertyuiop");
	}

	@When("^user Enter the (\\d+) digit Credit card number in credit card no fields$")
	public void user_Enter_the_digit_Credit_card_number_in_credit_card_no_fields(int arg1) throws Throwable {
		sendkeyElement(ob.getinstancebk().getCc_num(), "12345678910123654");
	}

	@When("^user 	Select the credit card Type in credit card type fields$")
	public void user_Select_the_credit_card_Type_in_credit_card_type_fields() throws Throwable {
		dropDown_Element(ob.getinstancebk().getCc_type(), "byindex", "2");
	}
	@When("^user Select the Month in Expiry Date fields$")
	public void user_Select_the_Month_in_Expiry_Date_fields() throws Throwable {
		dropDown_Element(ob.getinstancebk().getCc_exp_month(), "byindex", "5");
	}
	@When("^user Select the  year in Expiry Date fields$")
	public void user_Select_the_year_in_Expiry_Date_fields() throws Throwable {
		dropDown_Element(ob.getinstancebk().getCc_exp_year(), "byindex", "7");
	}
	@When("^user Enter the CVV number in Cvv number fields$")
	public void user_Enter_the_CVV_number_in_Cvv_number_fields() throws Throwable {
		sendkeyElement(ob.getinstancebk().getCc_cvv(), "0123");
	}

	@Then("^user click on the book now button Its take some time and its navigates to Booking conformation Page$")
	public void user_click_on_the_book_now_button_Its_take_some_time_and_its_navigates_to_Booking_conformation_Page()
			throws Throwable {
		clickonElement(ob.getinstancebk().getBook_now());
	}
	@When("^user will use the implicit wait for refresh page$")
	public void user_will_use_the_implicit_wait_for_refresh_page() throws Throwable {
		implicitwait(3000);
	}

	@Then("^user click on the logout button then It navigates the Home page$")
	public void user_click_on_the_logout_button_then_It_navigates_the_Home_page() throws Throwable {
		clickonElement(ob.getinstancepo().getLogout());
	}

}
