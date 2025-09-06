(defproject metabase/csv-driver "1.0.2-SNAPSHOT"
  :description "CSV Driver for Metabase"
  :min-lein-version "2.5.0"

  :dependencies [[org.clojure/clojure "1.11.1"]
                 [br.com.markenson/csvjdbc "1.3.1-metabase-SNAPSHOT" :local/root "lib/csvjdbc-1.3.1-metabase-SNAPSHOT.jar"]
                 [honeysql "1.0.461"]
                 [cheshire "5.11.0"]
                 [clj-time "0.15.2"]
                 [org.clojure/java.jdbc "0.7.12"]]

  :profiles
  {:provided
   {:dependencies [[metabase-core "1.0.0-SNAPSHOT"]]}

   :uberjar
   {:auto-clean true
    :aot :all
    :target-path "target/%s"
    :uberjar-name "csv.metabase-driver.jar"}})

