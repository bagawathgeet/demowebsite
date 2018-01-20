package com.demowebsite.pages;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "check1")
    @CacheLookup
    private WebElement checkAll;

    @FindBy(id = "isAgeSelected")
    @CacheLookup
    private WebElement clickOnThisCheckBox;

    @FindBy(css = "#easycont div.row div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) label input.cb1-element[type='checkbox']")
    @CacheLookup
    private WebElement option1;

    @FindBy(css = "#easycont div.row div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) label input.cb1-element[type='checkbox']")
    @CacheLookup
    private WebElement option2;

    @FindBy(css = "#easycont div.row div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(3) label input.cb1-element[type='checkbox']")
    @CacheLookup
    private WebElement option3;

    @FindBy(css = "#easycont div.row div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(4) label input.cb1-element[type='checkbox']")
    @CacheLookup
    private WebElement option4;

    private final String pageLoadedText = "When you uncheck at least one checkbox, button will change to 'Check All'";

    private final String pageUrl = "/test/basic-checkbox-demo.html";

    @FindBy(css = "button.navbar-toggle")
    @CacheLookup
    private WebElement toggleNavigation;

    public CheckBox() {
    }

    public CheckBox(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public CheckBox(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public CheckBox(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Check All Button.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox clickCheckAllButton() {
        checkAll.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox fill() {
        setClickOnThisCheckBoxCheckboxField();
        setOption1CheckboxField();
        setOption2CheckboxField();
        setOption3CheckboxField();
        setOption4CheckboxField();
        return this;
    }

    /**
     * Set Click On This Check Box Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox setClickOnThisCheckBoxCheckboxField() {
        if (!clickOnThisCheckBox.isSelected()) {
            clickOnThisCheckBox.click();
        }
        return this;
    }

    /**
     * Set Option 1 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox setOption1CheckboxField() {
        if (!option1.isSelected()) {
            option1.click();
        }
        return this;
    }

    /**
     * Set Option 2 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox setOption2CheckboxField() {
        if (!option2.isSelected()) {
            option2.click();
        }
        return this;
    }

    /**
     * Set Option 3 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox setOption3CheckboxField() {
        if (!option3.isSelected()) {
            option3.click();
        }
        return this;
    }

    /**
     * Set Option 4 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox setOption4CheckboxField() {
        if (!option4.isSelected()) {
            option4.click();
        }
        return this;
    }

    /**
     * Unset Click On This Check Box Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox unsetClickOnThisCheckBoxCheckboxField() {
        if (clickOnThisCheckBox.isSelected()) {
            clickOnThisCheckBox.click();
        }
        return this;
    }

    /**
     * Unset Option 1 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox unsetOption1CheckboxField() {
        if (option1.isSelected()) {
            option1.click();
        }
        return this;
    }

    /**
     * Unset Option 2 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox unsetOption2CheckboxField() {
        if (option2.isSelected()) {
            option2.click();
        }
        return this;
    }

    /**
     * Unset Option 3 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox unsetOption3CheckboxField() {
        if (option3.isSelected()) {
            option3.click();
        }
        return this;
    }

    /**
     * Unset Option 4 Checkbox field.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox unsetOption4CheckboxField() {
        if (option4.isSelected()) {
            option4.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the CheckBox class instance.
     */
    public CheckBox verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
