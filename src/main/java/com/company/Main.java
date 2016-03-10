package com.company;

import org.apache.commons.cli.*;
import org.apache.commons.lang.StringEscapeUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String PARAM_NODE_NAME = "nodeName";
    private static final String PARAM_JOB_NAME = "jobName";
    private static final String PARAM_WORKSPACE = "workspace";
    private static final String PARAM_JENKINS_HOME = "jenkinsHome";
/*    private static final String PARAM_PROJECTS_COUNT = "projectsCount";
    private static final String PARAM_PROJECT_LINK = "projectLink";
    private static final String PARAM_PROJECT_BUILDER_TYPE = "projectBuilderType";
    private static final String PARAM_PROJECT_BUILDER_ARCHITECTURE = "projectBuilderArchitecture";*/

    private static CommandLine commandLine;
    private static Map<String, Object> propertyMap;
    private static String[] args;
    private static Options options;


    public static void main(String[] args) throws ParseException {
        // write your code here

        StringBuilder line =new StringBuilder( "java -jar \"rtuertyldserver.jar\" -nodeName \"master\" -jobName \"1\" -workspace \"D:\\work\\workspace\\1\" -jenkinsHome \"D:\\configurator\\.\\work\" ");

       // System.out.println(line);
        String workspaceString = "-workspace \"";

        System.out.println(line.substring(line.indexOf(workspaceString)+workspaceString.length(),line.indexOf("\"",line.indexOf(workspaceString)+workspaceString.length())));

        CommandLineParser parserString = new DefaultParser();
        CommandLine cmd = parserString.parse( options, args);

        Map<String, String> argsMap = new HashMap<String, String>();
        CommandLineParser parser = new GnuParser();

        options = new Options();
        options.addOption(PARAM_NODE_NAME,true,"some description");
        options.addOption(PARAM_JOB_NAME,true,"some description");
        options.addOption(PARAM_WORKSPACE,true,"some description");
        options.addOption(PARAM_JENKINS_HOME,true,"some description");



/*

        commandLine = parser.parse(options,args);
        System.out.println(commandLine.getOptionValue(PARAM_NODE_NAME));
        System.out.println(commandLine.getOptionValue(PARAM_JOB_NAME));
        System.out.println(commandLine.getOptionValue(PARAM_WORKSPACE));
        System.out.println(commandLine.getOptionValue(PARAM_JENKINS_HOME));
*/



       /* if(projectCountParamValue== null || projectCountParamValue.matches("[0-9]+")){
            return;
        }
        int projectsCount = Integer.parseInt(projectCountParamValue);

        for (int projectIndex = 0; projectIndex < projectsCount; projectIndex++){
            String argsName = PARAM_PROJECT_LINK+projectIndex;
            options.addOption(argsName,true,"project # link");

        }



        System.out.println(commandLine.getOptionValue(PARAM_JOB_NAME));
*/

    }

}
