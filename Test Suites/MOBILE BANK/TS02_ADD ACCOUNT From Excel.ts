<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS02_ADD ACCOUNT From Excel</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>73291dfc-d95d-453e-9607-892bd3d342ea</testSuiteGuid>
   <testCaseLink>
      <guid>77bdfee9-5f8a-493c-8107-39db2c77c533</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/REGISTER/TC001_Register Account</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>8ccd3d82-9e06-48f4-bb40-7a364e793b44</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/LOGIN/TC002_Login01</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>35d5368a-3881-4cc3-80ea-613b8a94ba68</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/ADD ACCOUNT/TC003_Add Account - with data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>28e6d3b1-6277-4d04-8067-5f63dda8f8b3</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data file account</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>28e6d3b1-6277-4d04-8067-5f63dda8f8b3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>name</value>
         <variableId>95cc04dd-b1b2-4b4b-a390-94dbc69c2edc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>28e6d3b1-6277-4d04-8067-5f63dda8f8b3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ammount</value>
         <variableId>f32836a9-c200-487e-b7e2-92b0258dd959</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
