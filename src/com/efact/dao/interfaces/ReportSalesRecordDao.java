package com.efact.dao.interfaces;

import java.sql.Date;
import java.util.List;
import com.efact.bean.*;

public interface ReportSalesRecordDao {

	public List<ReportSalesRecord> salesRecordSearch(
			int sequence, 
		    float from,    
		    float to
    ) throws Exception;
	
	public ReportSalesRecord findOneById(String id) throws Exception;
	
}