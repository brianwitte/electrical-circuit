package com.technik.circuit;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;
import java.util.List;

/**
 * Calculate world!
 *
 */
public class App 
{
	    public static void main(String [] args) throws Exception
    {

        try {

            ANTLRInputStream antlrInputStream = new ANTLRInputStream("R1+L1+C1+(((R2*L2)+C2+R3)*R4)+L3+C3");

            CalculateLexer lexer = new CalculateLexer(antlrInputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalculateParser parser = new CalculateParser(tokens);
            ParseTree tree = parser.expression();


            StringBuilder flatTree = new StringBuilder("\n********************\nFlat Tree structure: \n********************\n\n");
            flatTree.append(tree.toStringTree(parser));
            System.out.println(flatTree);

            List<String> ruleNamesList = Arrays.asList(parser.getRuleNames());
            String prettyTree = TreeUtils.toPrettyTree(tree, ruleNamesList);

            StringBuilder nestedTree = new StringBuilder("\n**********************\nNested Tree structure: \n**********************\n\n");
            nestedTree.append(prettyTree);
            System.out.println(nestedTree);


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
