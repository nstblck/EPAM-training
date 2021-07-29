package test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CloudCalculatorPageTests extends PageTests{
    @Test(description = "Checking expected price equals calculated")
    public void isCalculatedPriceEqualsExpected() {
        fillTheFormAndReadMail();
        String exist = cloudCalculatorPage.getCalculatedPrices();
        String expectedMonthPrice = "Total Estimated Cost: USD 1,083.33 per 1 month";
        assertEquals(expectedMonthPrice, exist);
    }

    private void fillTheFormAndReadMail(){
        cloudCalculatorPage.openCloudPage()
                .searchCalculatorPage()
                .selectComputeEngine()
                .fillInstancesField()
                .selectOperatingSystem()
                .selectMachineClass()
                .selectSeries()
                .selectInstanceType()
                .selectCheckboxCPU()
                .selectNumbersOfCPUs()
                .selectGPUType()
                .selectLocalSSD()
                .selectDataCenterLocation()
                .setCommittedUsage()
                .pushEstimateButton()
                .openMinuteMailHomePageAndGettingMail()
                .pasteCreatedMailForGettingCalculatedPrice()
                .readMail();
    }
}
