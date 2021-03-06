package uk.ac.ebi.pride.utilities.ols.web.service.utils;

/**
 * @author Yasset Perez-Riverol (ypriverol@gmail.com)
 * date 02/03/2016
 */
public class Constants {
    public static final int ONTOLOGY_PAGE_SIZE = 100;
    public static final int SEARCH_PAGE_SIZE   = 100;
    public static final int TERM_PAGE_SIZE = 1000;
    public static final String REFERENCE_SEPARATOR = ":";
    public static final String OLS_PROTOCOL = "http";
    public static final String OLS_SERVER = "www.ebi.ac.uk/ols/"; //todo ready to switch to production when out of beta
                                          // www.ebi.ac.uk/ols/
    public static final String OLS_SERVER_DEV = "snarf.ebi.ac.uk:8980/ols-beta"; //todo ready to switch to production when out of beta
                                          // wwwdev.ebi.ac.uk/ols/
}
