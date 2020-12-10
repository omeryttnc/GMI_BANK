Feature: Test password strength functionality
  Background:
    Given go to homepage and click user icon
    Given click register page

  @with1DifferentChar
  Scenario: Check level and color of chart status
    When edit password field with 1 char type variety
      |1234567 |
      |abcdefg |
      |ABCDEFG |
      |@!<.#;& |

  @with2DifferentChar
  Scenario: Check level and color of chart status
    When edit password field with 2 char type variety
      |123456a |
      |abcdef1 |
      |ABCDEF1 |
      |@!<.#;1 |

  @with3DifferentChar
  Scenario: Check level and color of chart status
    When edit password field with 3 char type variety
      |12345aB |
      |abcde1F |
      |ABCDE1f |
      |@!<.#1f |

  @with4DifferentChar
  Scenario: Check level and color of chart status
    When edit password field with 4 char type variety
      |12345aB! |
      |abcde1F! |
      |ABCDE1f! |
      |@!<.#1fA |
      Then close browser