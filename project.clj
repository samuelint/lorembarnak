(defproject org.clojars.samuelint/lorembarnak "1.0.0"
  :description "The Québécois swear generator"
  :license "MIT"
  :url "https://github.com/samuelint/lorembarnak"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns lorembarnak.core}
  :main lorembarnak.core
  :aot [lorembarnak.core])
