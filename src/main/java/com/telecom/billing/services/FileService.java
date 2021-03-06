/**
 * 
 */
package com.telecom.billing.services;

import java.io.File;
import java.text.ParseException;


/**
 * @author Eric
 *
 */
public interface FileService {
	
	/**
	 *  file format: pdf
	 * @param fileName (format: Bill_srcPhoneNo_date)
	 * @return full path of the file
	 * @throws Exception 
	 */
	
	public String generateMonthlyBills(String month) throws Exception;
	/**
	 * file format : pdf
	 * @param fileName (format: Rate_service_srccty_date )
	 * @return full path of the file
	 * @throws Exception 
	 */
	public void processBillBatch(String fileName) throws ParseException ;
	public String generateRateSheet(String fileName) throws Exception;
	public void processTrafficBatch(String fileName) throws ParseException;
	public void processCommissionBatch(String fileName) throws ParseException;
	
	/**
	 * file format : single sheet Excel
	 * @param fileName (format: TrafficSummary_201411 )
	 * @return full path of the file
	 * @throws Exception 
	 */
	public String generateTrafficSummary(String fileName) throws Exception;
	
	/**
	 * file format : multiple sheets Excel
	 * @param fileName (format: Rates_201411)
	 * @return full path of the file
	 * @throws Exception 
	 */
	public String createRateSheet(String fileName) throws Exception;
	
	/**
	 * @param callFile:File in excel format
	 * @return CallDetail list;
	 * @throws Exception 
	 */
	public boolean readCallFile(File callFile) throws Exception;
	
	/**
	 * 
	 * @param rateFile
	 * @return RateHistory list
	 * @throws Exception 
	 */
	
	public boolean readRateFile(File rateFile) throws Exception;
	
	
	
	public void processRateUpdate();
	
	
	public String generateMonthCommissions(String fileName) throws Exception;
}
