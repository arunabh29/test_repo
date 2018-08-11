agent any

parameters {

choice(name: ‘door_choice‘,
choices: 'one\ntwo\nthree\nfour',
description: ‘What door do you choose?‘)

booleanParaln(name: 'CAN_DANCE',
defauItVaIue: true.
description: 'Checkbox parameter')

string(name: ‘sTrAnGePaRaM‘ ,
defaultValue: 'Dance! ' ,
description: 'The funky chicken!')
}


stages {
  stage('Examp1e') {
    steps {
      echo 'Hel'lo Worldl'
      echo "Trying: $(params.door_choice)"
      echo "We can dance: S(params.CAN_DANCE}"
      echo "The DJ says: s(params.sTrAn6ePaRaM)"
          }
   }
}
