/*

Question:
Objective: Write the Test Case in java by getting all the URI from “datasetinstanceelements” JSON element for given set of “dataSetId’s” ( for e.g 8 & 9 ) and compare the datafile ( data1 to data8 ) with golden dataset i.e master file

Method signature for the testCase :
public void compareGeneratedData(File generatedFilePath,
						      List<String> dataSetIds)

Output :
DataSetId: <id>, DataSetInstanceElementId : <id> , matchStatus: <true|false>

If the generated data file is under the location.
s3://generated/path1/path2/data1
The location of the master file will be
        s3://master/path1/path2/data1

Assume there are helper methods for the following
String getMasterPath(String generatedPath)
String getGeneratedData(String generatedPath).

 

Json Test Data File:
[
  {
        "id": 11,
        "dataSetId": 8,
        " dataSourceId": 0,
        "dataAcquisitionTime": 1470323704,
        "dataNominalStartTime": 1463962500,
        "dataNominalEndTime": 1463963400,
        "createTime": "2016-08-04 15:13:28.0",
        "updateTime": "2016-08-04 15:13:28.0",
        "state": "READY",
        "datasetinstanceelements": [
            {
                "id": 11,
                "uri": "s3://generated/path1/path2/data1",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            },
                                  {
                "id": 12,
                "uri": "s3://generated/path1/path2/data2",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            },
                                  {
                "id": 13,
                "uri": "s3://generated/path1/path2/data3",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            },
                                  {
                "id": 14,
                "uri": "s3:// generated/path1/path2/data4",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            }
        ]
    },
   {
        "id": 12,
        "dataSetId": 9,
        "dataSourceId": 0,
        "dataAcquisitionTime": 1470323704,
        "dataNominalStartTime": 1463962500,
        "dataNominalEndTime": 1463963400,
        "createTime": "2016-08-04 15:13:28.0",
        "updateTime": "2016-08-04 15:13:28.0",
        "state": "READY",
        "datasetinstanceelements": [
            {
                "id": 11,
                "uri": "s3://generated/path1/path2/data5",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            },
                                  {
                "id": 12,
                "uri": "s3://generated/path1/path2/data6",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            },
                                  {
                "id": 13,
                "uri": "s3://generated/path1/path2/data7",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            },
                                  {
                "id": 14,
                "uri": "s3://generated/path1/path2/data8",
                "attribs": null,
                "createTime": "2016-08-04 15:13:28.0",
                "updateTime": "2016-08-04 15:13:28.0"
            }
        ]
    }
 
]




*/



package com.wbl;

public class HttpClient_LifeLockExample {

	
	
	
	
	
}
