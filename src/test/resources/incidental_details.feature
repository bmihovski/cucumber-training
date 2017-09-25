Feature: Client invoice
  Background: Login to the website
  	Given I am a signed-in user with role: admin
  Scenario Outline: passing background
    Then I should have '<project>' '<client>'
    Examples:
	   | project       | "Test Project" |
	   | client        | "Test Client"  |


  Scenario Outline: another passing background
    Then I should have an '<issue>' completed '<completed_on>' for '<hours>' h
    Examples:
	   | issue         | "Test Issue"   |
	   | completed_on  | "2011-08-24"   |
	   | hours         | "7.5"          |

Scenario: Create an invoice
Given I attempt to view the admin invoices page and "Test Client" record
And After filling "invoice_id" with "abc" and comfirming with "Submit"
Then I am shown a admin invoices page and "Test Client" is not present