Feature: withdraw with OD account
    As a bank
    The normal account can't overdraw but the OD account can overdraw

Background:
    Given a customer with id 1 and pin 111 with balance 200 in OD account
    And I login to ATM with id 1 and pin 111

Scenario: Withdraw amount less than balance
    When I withdraw 50 from ATM
    Then my account balance is 150

Scenario: Withdraw amount more than balance
    When I overdraw 500 from ATM
    Then my account balance is -300