package javaposse.jobdsl.dsl.helpers.publisher

import javaposse.jobdsl.dsl.Context

class WorksoneContext implements Context {
    String recipients
    boolean always = false
    boolean backToNormal = false

    void recipients(String recipients) {
        this.recipients = recipients
    }

    /**
     * If set, marks the build as unstable if any warnings are found. Defaults to {@code false}.
     */
    void always(boolean always = true) {
        this.always = always
    }

    /**
     * If set, marks the build as failed if any errors are found. Defaults to {@code false}.
     */
    void backToNormal(boolean backToNormal = true) {
        this.backToNormal = backToNormal
    }
}
