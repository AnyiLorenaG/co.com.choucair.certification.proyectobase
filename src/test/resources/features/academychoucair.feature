
  @stories
    Feature: Academy Choucair
      As a user I want to learn how to automate in screeanplay at the Choucair Academy with  the automation course
    @stories
    Scenario: Search for a automation course
      Given Than brandon wants to learn automation at the academy Choucair
        | strUser | strPassword |
        | 1020469864 | Choucair2021*  |
      When  he search for the course  on the choucair academy platform
        | strCourse |
        | Metodologia Bancolombia |
      Then  he finds the course called
        | strCourse |
        | Metodología Bancolombia |