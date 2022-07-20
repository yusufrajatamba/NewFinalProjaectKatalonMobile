<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS03_Make Deposit</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>9a3fedd7-464d-41bb-ba53-ea32be90c934</testSuiteGuid>
   <testCaseLink>
      <guid>8408ff50-b2cf-40c4-a42b-a7c51ae0f2cf</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/TC001_Register Account</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>fddd2db8-db90-4fa9-9d9d-1f473a0e554e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/TC002_Login01</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>2531053c-8bc2-41d7-b664-fba60e62d012</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/TC003_Add Account - with data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>792c5f52-c9c5-4e9a-8820-195eacbde75c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data file account</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>792c5f52-c9c5-4e9a-8820-195eacbde75c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>name</value>
         <variableId>95cc04dd-b1b2-4b4b-a390-94dbc69c2edc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>792c5f52-c9c5-4e9a-8820-195eacbde75c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ammount</value>
         <variableId>f32836a9-c200-487e-b7e2-92b0258dd959</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f32533b0-c9ba-4f2a-8d01-a2483b46022b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Transsaction/TC05_Make Deposit</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
