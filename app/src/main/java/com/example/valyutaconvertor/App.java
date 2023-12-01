package com.example.valyutaconvertor;

import android.app.Application;
import com.example.valyutaconvertor.models.Models;
import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    String a = "UAE Dirham%Afghan Afghani%Albanian Lek%Armenian Dram%Netherlands%"+
            "Antillian Guilder%Angolan Kwanza%Argentine Peso%Australian Dollar%Aruban%"+
            "Florin%Azerbaijani Manat%Bosnia and Herzegovina Convertible Mark%Barbados"+
            "Dollar%Bangladeshi Taka%Bulgarian Lev%Bahraini Dinar%Burundian"+
            "Franc%Bermudian Dollar%Brunei Dollar%Bolivian Boliviano%Brazilian"+
            "Real%Bahamian Dollar%Bhutanese Ngultrum%Botswana Pula%Belarusian"+
            "Ruble%Belize Dollar%Canadian Dollar%Congolese Franc%Swiss Franc%Chilean"+
            "Peso%Chinese Renminbi%Colombian Peso%Costa Rican Colon%Cuban Peso%Cape"+
            "Verdean Escudo%Czech Koruna%Djiboutian Franc%Danish Krone%Dominican"+
            "Peso%Algerian Dinar%Egyptian Pound%Eritrean Nakfa%Ethiopian"+
            "Birr%Euro%Fiji Dollar%Falkland Islands Pound%Faroese Króna%Pound"+
            "Sterling%Georgian Lari%Guernsey Pound%Ghanaian Cedi%Gibraltar"+
            "Pound%Gambian Dalasi%Guinean Franc%Guatemalan Quetzal%Guyanese"+
            "Dollar%Hong Kong Dollar%Honduran Lempira%Croatian Kuna%Haitian"+
            "Gourde%Hungarian Forint%Indonesian Rupiah%Israeli New Shekel%Manx"+
            "Pound%Indian Rupee%Iraqi Dinar%Iranian Rial%Icelandic Króna%Jersey"+
            "Pound%Jamaican Dollar%Jordanian Dinar%Japanese Yen%Kenyan"+
            "Shilling%Kyrgyzstani Som%Cambodian Riel%Kiribati Dollar%Comorian"+
            "Franc%South Korean Won%Kuwaiti Dinar%Cayman Islands Dollar%Kazakhstani"+
            "Tenge%Lao Kip%Lebanese Pound%Sri Lanka Rupee%Liberian Dollar%Lesotho"+
            "Loti%Libyan Dinar%Moroccan Dirham%Moldovan Leu%Malagasy"+
            "Ariary%Macedonian Denar%Burmese Kyat%Mongolian Tögrög%Macanese"+
            "Pataca%Mauritanian Ouguiya%Mauritian Rupee%Maldivian Rufiyaa%Malawian"+
            "Kwacha%Mexican Peso%Malaysian Ringgit%Mozambican Metical%Namibian"+
            "Dollar%Nigerian Naira%Nicaraguan Córdoba%Norwegian Krone%Nepalese"+
            "Rupee%New Zealand Dollar%Omani Rial%Panamanian Balboa%Peruvian Sol%Papua"+
            "New Guinean Kina%Philippine Peso%Pakistani Rupee%Polish Złoty%Paraguayan"+
            "Guaraní%Qatari Riyal%Romanian Leu%Serbian Dinar%Russian Ruble%Rwandan"+
            "Franc%Saudi Riyal%Solomon Islands Dollar%Seychellois Rupee%Sudanese"+
            "Pound%Swedish Krona%Singapore Dollar%Saint Helena Pound%Sierra Leonean"+
            "Leone%Sierra Leonean Leone%Somali Shilling%Surinamese Dollar%South"+
            "Sudanese Pound%São Tomé and Príncipe Dobra%Syrian Pound%Eswatini"+
            "Lilangeni%Thai Baht%Tajikistani Somoni%Turkmenistan Manat%Tunisian"+
            "Dinar%Tongan Paʻanga%Turkish Lira%Trinidad and Tobago Dollar%Tuvaluan"+
            "Dollar%New Taiwan Dollar%Tanzanian Shilling%Ukrainian Hryvnia%Ugandan"+
            "Shilling%United States Dollar%Uruguayan Peso%Uzbekistani So'm%Venezuelan"+
            "Bolívar Soberano%Vietnamese Đồng%Vanuatu Vatu%Samoan Tālā%Central African"+
            "CFA Franc%East Caribbean Dollar%Special Drawing Rights%West African CFA"+
            "franc%CFP Franc%Yemeni Rial%South African Rand%Zambian Kwacha%Zimbabwean"+
            "Dollar%";
    public List<Models> name = new ArrayList<>();
    public List<String> getNames = new ArrayList<>();
    void List() {
        getNames.add("UAE Dirham");
        getNames.add("Afghan Afghani");
        getNames.add("Albanian Lek");
        getNames.add("Armenian Dram");
        getNames.add("Netherlands Antillian Guilder");
        getNames.add("Angolan Kwanza");
        getNames.add("Argentine Peso");
        getNames.add("Australian Dollar");

    }
}
