@account_summary
Feature: Account Summary

  @acct_summary_page_title
  Scenario: Account summary page should have the title Zero - Account Summary.
    Given the user is logged in
    Then the page title should be "Zero - Account Summary"

    @account_types
  Scenario: Account summary page should have  Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts.
    Given the user is logged in
    Then the user should see the following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
