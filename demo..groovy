pipeline {

   agent { node { label "AUSLAB_WIN10_DOMINO_FW_CDB_MB_2"} }
      stages{

        stage('Setup'){

            steps{
                echo "QAC_TEST_SET"
                echo "${env.QAC_TEST_SET}"

            }
        }


        stage('Initiate'){

            steps{

                echo "Initiate stage"
                //input "Does the staging environment look ok?"

            }
            

        }

        stage('Complete'){

            steps{

                echo "Complete stage"

            }

        }

        stage('TearDown'){

            steps{

                echo "TearDown stage"}
            
            }
            
        }
}
