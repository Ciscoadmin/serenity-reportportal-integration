package com.github.invictum.reportportal;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Entry point for retrieving injector to build module class graph
 */
public class IntegrationInjector {

    private static Injector injector;

    public static Injector getInjector() {
        if (injector == null) {
            synchronized (IntegrationInjector.class) {
                if (injector == null) {
                    injector = Guice.createInjector(new SerenityPortalModule());
                }
            }
        }
        return injector;
    }
}
