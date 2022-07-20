<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS04_Make A Transfer</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>a118ac9c-5876-4885-8418-369505373cd0</testSuiteGuid>
   <testCaseLink>
      <guid>f3fee99d-26f8-4d2d-ac24-f2d3e73616ea</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/REGISTER/TC001_Register Account</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>267bbcaa-c4de-4524-82ef-718e29328903</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/LOGIN/TC002_Login01</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>0ce5a501-cb17-432c-8e18-7e0768e09b47</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/USER ACCOUNT/ADD ACCOUNT/TC003_Add Account - with data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>cb088838-2d73-4591-a340-fe426f1c305a</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data file account</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>cb088838-2d73-4591-a340-fe426f1c305a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>name</value>
         <variableId>95cc04dd-b1b2-4b4b-a390-94dbc69c2edc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>cb088838-2d73-4591-a340-fe426f1c305a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ammount</value>
         <variableId>f32836a9-c200-487e-b7e2-92b0258dd959</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>b6b93844-f00f-4f20-b2b3-7b0d590afd69</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Transsaction/TC06_Make a Transfer</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>6f8d9510-11bd-4794-9700-190e4b872680</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>3731efa6-04d7-4b0d-8ef9-78b67f784c4d</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
