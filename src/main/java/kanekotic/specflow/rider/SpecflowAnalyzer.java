package kanekotic.specflow.rider;

import gherkin.Parser;
import gherkin.ast.GherkinDocument;

public class SpecflowAnalyzer implements ISpecflowAnalyzer {

    private Parser<GherkinDocument> parser;

    public SpecflowAnalyzer(Parser<GherkinDocument> parser) {
        this.parser = parser;
    }

    @Override
    public SpecflowFileContents analyze(String file) {
        GherkinDocument gherkinDocument = parser.parse(file);
        return new SpecflowFileContents();
    }

}