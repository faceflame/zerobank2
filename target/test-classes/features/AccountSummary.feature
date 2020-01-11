@account_summary
Feature: Account Summary

@acct_summary_page_title
Scenario: Account summary page should have the title Zero - Account Summary.
  Given the user is logged in
  Then the page title should be "Zero - Account Summary"

