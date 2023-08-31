package com.crud

class Team {

  //  static belongsTo = [team: Team]
    String name
    Integer age
//    String age
    String position

//    Team team

    static constraints = {
        name size: 5..40, blank: false
       age min: 16
        position size: 5..40, blank: false
//        team (inList:['abohani','mehomadan', 'Kolabagan'])
    }
    String toString() {
        name
    }
}
