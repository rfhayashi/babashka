(ns babashka.impl.reitit
  {:no-doc true}
  (:require [reitit.core :as r]
            [sci.impl.namespaces :refer [copy-var]]
            [sci.impl.vars :as vars]))

(def reitit-ns (vars/->SciNamespace 'reitit.core nil))

(def reitit-namespace
  {'router (copy-var r/router reitit-ns)
   'router? (copy-var r/router? reitit-ns)
   'match-by-path (copy-var r/match-by-path reitit-ns)})

