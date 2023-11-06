package com.pdf.service;

import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.pdf.entities.Planner;
import com.pdf.repositories.PlannerRepository;

 

@Service
public class PlannerService {
	
	@Autowired
	private PlannerRepository plannerRepository;
	
	public void uploadAndStoreFile(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();

        if (originalFilename != null) {
            if (originalFilename.endsWith(".xls") || originalFilename.endsWith(".xlsx")) {
                uploadAndStoreExcel(file.getInputStream());
            } else if (originalFilename.endsWith(".csv")) {
                uploadAndStoreCSV(file.getInputStream());
            } else {
                throw new IllegalArgumentException("Unsupported file format. Supported formats are .xls, .xlsx, and .csv.");
            }
        } else {
            throw new IllegalArgumentException("Invalid file.");
        }
    }

    private void uploadAndStoreExcel(InputStream fileInputStream) throws IOException {
        List<Planner> planners = parseExcel(fileInputStream);
        plannerRepository.saveAll(planners);
    }

    private List<Planner> parseExcel(InputStream fileInputStream) throws IOException {
        List<Planner> planners = new ArrayList<>();
        try (InputStream is = fileInputStream) {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheetAt(0);  

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                Planner planner = new Planner();
                Cell cell0 = row.getCell(0);
                if (cell0.getCellType() == CellType.NUMERIC) {
                    planner.setId((long) cell0.getNumericCellValue());
                } else {
                    planner.setId(0L);
                }
 

                Cell cell1 = row.getCell(1);
                if (cell1.getCellType() == CellType.STRING) {
                    planner.setTMonth(cell1.getStringCellValue());
                } else {
                    planner.setTMonth("N/A");
                }

                Cell cell2 = row.getCell(2);
                if (cell2.getCellType() == CellType.STRING) {
                	planner.setTDates( cell2.getStringCellValue()); 
//                	planner.setTDates(DATE_FORMAT.parse(row.getCell(1).getStringCellValue())); 

                } else {
                    planner.setTDates("N/A");
                }

                Cell cell3 = row.getCell(3);
                if (cell3.getCellType() == CellType.STRING) {
                    planner.setTOrganisers(cell3.getStringCellValue());
                } else {
                    planner.setTOrganisers( "N/A");
                }
                Cell cell4 = row.getCell(4);
                if (cell4.getCellType() == CellType.STRING) {
                	planner.setTNames(cell4.getStringCellValue());
                } else {
                	planner.setTNames("N/A");
                }
                Cell cell5 = row.getCell(5);
                if (cell5.getCellType() == CellType.STRING) {
                	planner.setTSubjects(cell5.getStringCellValue());
                } else {
                	planner.setTSubjects( "N/A");
                }
                Cell cell6 = row.getCell(6);
                if (cell6.getCellType() == CellType.STRING) {
                	planner.setTCategory(cell6.getStringCellValue());
                } else {
                	planner.setTCategory( "N/A");
                }
                Cell cell7 = row.getCell(7);
                if (cell7.getCellType() == CellType.STRING) {
                	planner.setTSpell(cell7.getStringCellValue());
                } else {
                	planner.setTSpell( "N/A");
                }
                Cell cell8= row.getCell(8);
                if (cell8.getCellType() == CellType.STRING) {
                	planner.setPreferredLocation(cell8.getStringCellValue());
                } else {
                	planner.setPreferredLocation( "N/A");
                }
                Cell cell9= row.getCell(9);
                if (cell9.getCellType() == CellType.STRING) {
                	planner.setAttndGrades(cell9.getStringCellValue());
                } else {
                	planner.setAttndGrades( "N/A");
                }
                Cell cell10= row.getCell(10);
                if (cell10.getCellType() == CellType.STRING) {
                	planner.setTargetGroup(cell10.getStringCellValue());
                } else {
                	planner.setTargetGroup( "N/A");
                }
                Cell cell11= row.getCell(11);
                if (cell11.getCellType() == CellType.NUMERIC) {
                	planner.setNoOfStakeholders((int) row.getCell(11).getNumericCellValue());
                } else {
                	planner.setNoOfStakeholders(0);
                }
                Cell cell12= row.getCell(12);
                if (cell12.getCellType() == CellType.STRING) {
                	planner.setTDuration(cell12.getStringCellValue());
                } else {
                	planner.setTDuration("N/A");
                }
                Cell cell13= row.getCell(13);
                if (cell13.getCellType() == CellType.STRING) {
                	planner.setTHourPerDay(cell13.getStringCellValue());
                } else {
                	planner.setTHourPerDay("N/A");
                }
                Cell cell14= row.getCell(14);
                if (cell14.getCellType() == CellType.STRING) {
                	planner.setTotalHours(cell14.getStringCellValue());
                } else {
                	planner.setTotalHours("N/A");
                }
                
//                Cell cell13= row.getCell(13);
//                if (cell13.getCellType() == CellType.NUMERIC) {
//                	planner.setTHourPerDay((int)cell13.getNumericCellValue());
//                } else {
//                	planner.setTHourPerDay(0);
//                }
//                Cell cell14= row.getCell(14);
//                if (cell14.getCellType() == CellType.NUMERIC) {
//                	planner.setTotalHours((int)cell14.getNumericCellValue());
//                } else {
//                	planner.setTotalHours(0);
//                }
                Cell cell15= row.getCell(15);
                if (cell15.getCellType() == CellType.STRING) {
                	planner.setMode(cell15.getStringCellValue());
                } else {
                	planner.setMode("N/A");
                }
                
                planners.add(planner);
            }

            workbook.close();
            return planners;
        }
    }

    private void uploadAndStoreCSV(InputStream fileInputStream) throws IOException {
        List<Planner> planners = parseCSV(fileInputStream);
        plannerRepository.saveAll(planners);
    }

    private List<Planner> parseCSV(InputStream fileInputStream) throws IOException {
        List<Planner> planners = new ArrayList<>();
        try (InputStream is = fileInputStream) {
            CSVReader csvReader = new CSVReader(new InputStreamReader(is));
            String[] record;

            try {
				while ((record = csvReader.readNext()) != null) {
				    Planner planner = new Planner();

 //				    if (record.length > 0) {
//				        planner.setId(Long.parseLong(record[0]));
//				    }
				    if(record.length>0) {
				    	try {
							long id = Long.parseLong(record[0]);
							planner.setId(id);
						} catch (Exception e) {
						}
				    }

				    if (record.length > 1) {
				        planner.setTMonth(record[1]);
				    }
				    if (record.length > 1) {
				    	planner.setTDates(record[2]);
				    }
				    if (record.length > 1) {
				    	planner.setTOrganisers(record[3]);
				    }
				    if (record.length > 1) {
				    	planner.setTNames(record[4]);
				    }
				    if (record.length > 1) {
				    	planner.setTSubjects(record[5]);
				    }
				    if (record.length > 1) {
				    	planner.setTCategory(record[6]);
				    }
				    if (record.length > 1) {
				    	planner.setTSpell(record[7]);
				    }
				    if (record.length > 1) {
				    	planner.setPreferredLocation(record[8]);
				    }
				    if (record.length > 1) {
				    	planner.setAttndGrades(record[9]);
				    }
				    if (record.length > 1) {
				    	planner.setTargetGroup(record[10]);
				    }
				    if (record.length > 11) {
				        try {
				            int numberOfStakeholders = Integer.parseInt(record[11]);
				            planner.setNoOfStakeholders(numberOfStakeholders);
				        } catch (NumberFormatException e) {
				            
				        }
				    }

				    if (record.length > 1) {
				    	planner.setTDuration(record[12]);
				    }
				    if (record.length > 1) {
				    	planner.setTHourPerDay(record[13]);
				    }
				    if (record.length > 1) {
				    	planner.setTotalHours(record[14]);
				    }
 
				    if (record.length > 1) {
				    	planner.setMode(record[15]);
				    } 
				    planners.add(planner);
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

            csvReader.close();
            return planners;
        }
    }
    
	 public List<Planner> getAllPlanners() {
	        return plannerRepository.findAll();
	    }

	
//	 public void uploadAndStoreExcel(MultipartFile file) throws IOException {
//	        // Check if the uploaded file is an Excel file
//	        if (!isExcelFile(file)) {
//	            throw new IllegalArgumentException("Uploaded file is not in Excel format.");
//	        }
//
//	        // Parse the Excel file and store data in the database
//	        List<Planner> planners = parseExcel(file);
//	        plannerRepository.saveAll(planners);
//	    }
//
//	    private boolean isExcelFile(MultipartFile file) {
//	        // Check if the file has an Excel file extension (e.g., .xls or .xlsx)
//	        String originalFilename = file.getOriginalFilename();
//	        return originalFilename != null && (originalFilename.endsWith(".xls") || originalFilename.endsWith(".xlsx") || originalFilename.endsWith(".csv"));
//	    }
//
//	    private List<Planner> parseExcel(MultipartFile file) throws IOException {
//	        List<Planner> planners = new ArrayList<>();
//	        try (InputStream is = file.getInputStream()) {
//	            Workbook workbook = new XSSFWorkbook(is); // For .xlsx files, use HSSFWorkbook for .xls files
//
//	            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
//
//	            for (Row row : sheet) {
//	                if (row.getRowNum() == 0) {
//	                    // Skip the header row
//	                    continue;
//	                }
//
//	                Planner planner = new Planner();
//	                Cell cell0 = row.getCell(0);
//	                if (cell0.getCellType() == CellType.NUMERIC) {
//	                    planner.setId((long) cell0.getNumericCellValue());
//	                } else {
//	                    // Handle the error or set a default value
//	                    planner.setId(0L);
//	                }
//	 
//
//	                Cell cell1 = row.getCell(1);
//	                if (cell1.getCellType() == CellType.STRING) {
//	                    planner.setTMonth(cell1.getStringCellValue());
//	                } else {
//	                    planner.setTMonth("N/A");
//	                }
//
//	                Cell cell2 = row.getCell(2);
//	                if (cell2.getCellType() == CellType.STRING) {
//	                	planner.setTDates( cell2.getStringCellValue()); 
////	                	planner.setTDates(DATE_FORMAT.parse(row.getCell(1).getStringCellValue())); 
//
//	                } else {
//	                    planner.setTDates("N/A");
//	                }
//
//	                Cell cell3 = row.getCell(3);
//	                if (cell3.getCellType() == CellType.STRING) {
//	                    planner.setTOrganisers(cell3.getStringCellValue());
//	                } else {
//	                    planner.setTOrganisers( "N/A");
//	                }
//	                Cell cell4 = row.getCell(4);
//	                if (cell4.getCellType() == CellType.STRING) {
//	                	planner.setTNames(cell4.getStringCellValue());
//	                } else {
//	                	planner.setTNames("N/A");
//	                }
//	                Cell cell5 = row.getCell(5);
//	                if (cell5.getCellType() == CellType.STRING) {
//	                	planner.setTSubjects(cell5.getStringCellValue());
//	                } else {
//	                	planner.setTSubjects( "N/A");
//	                }
//	                Cell cell6 = row.getCell(6);
//	                if (cell6.getCellType() == CellType.STRING) {
//	                	planner.setTCategory(cell6.getStringCellValue());
//	                } else {
//	                	planner.setTCategory( "N/A");
//	                }
//	                Cell cell7 = row.getCell(7);
//	                if (cell7.getCellType() == CellType.STRING) {
//	                	planner.setTSpell(cell7.getStringCellValue());
//	                } else {
//	                	planner.setTSpell( "N/A");
//	                }
//	                Cell cell8= row.getCell(8);
//	                if (cell8.getCellType() == CellType.STRING) {
//	                	planner.setPreferredLocation(cell8.getStringCellValue());
//	                } else {
//	                	planner.setPreferredLocation( "N/A");
//	                }
//	                Cell cell9= row.getCell(9);
//	                if (cell9.getCellType() == CellType.STRING) {
//	                	planner.setAttndGrades(cell9.getStringCellValue());
//	                } else {
//	                	planner.setAttndGrades( "N/A");
//	                }
//	                Cell cell10= row.getCell(10);
//	                if (cell10.getCellType() == CellType.STRING) {
//	                	planner.setTargetGroup(cell10.getStringCellValue());
//	                } else {
//	                	planner.setTargetGroup( "N/A");
//	                }
//	                Cell cell11= row.getCell(11);
//	                if (cell11.getCellType() == CellType.NUMERIC) {
//	                	planner.setNoOfStakeholders((int) row.getCell(11).getNumericCellValue());
//	                } else {
//	                	planner.setNoOfStakeholders(0);
//	                }
//	                Cell cell12= row.getCell(12);
//	                if (cell12.getCellType() == CellType.STRING) {
//	                	planner.setTDuration(cell12.getStringCellValue());
//	                } else {
//	                	planner.setTDuration("N/A");
//	                }
//	                Cell cell13= row.getCell(13);
//	                if (cell13.getCellType() == CellType.NUMERIC) {
//	                	planner.setTHourPerDay((int)cell13.getNumericCellValue());
//	                } else {
//	                	planner.setTHourPerDay(0);
//	                }
//	                Cell cell14= row.getCell(14);
//	                if (cell14.getCellType() == CellType.NUMERIC) {
//	                	planner.setTotalHours((int)cell14.getNumericCellValue());
//	                } else {
//	                	planner.setTotalHours(0);
//	                }
//	                Cell cell15= row.getCell(15);
//	                if (cell15.getCellType() == CellType.STRING) {
//	                	planner.setMode(cell15.getStringCellValue());
//	                } else {
//	                	planner.setMode("N/A");
//	                }
//	                
//
//	                planners.add(planner);
//	            }
//
//	            workbook.close();
//	            return planners;
//	        }
//	    }
}

