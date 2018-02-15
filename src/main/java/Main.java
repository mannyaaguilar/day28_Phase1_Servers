import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            response.redirect("/index.html");
            return null;
        });

        get("/people", (request, response) -> {
            System.out.println("Step 7");
            response.type("application/json");
            return "{\n" +
                    "  \"people\": [\n" +
                    "\n" +
                    "    {\n" +
                    "      \"name\": \"Scott\",\n" +
                    "      \"city\": \"Minnesota\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Koddie\",\n" +
                    "      \"city\": \"Iowa\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Mark\",\n" +
                    "      \"city\": \"Maine\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Ted\",\n" +
                    "      \"city\": \"Chicago\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Joan\",\n" +
                    "      \"city\": \"Chicago\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Lori\",\n" +
                    "      \"city\": \"Miramar\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Manny\",\n" +
                    "      \"city\": \"Santa Ana\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Zech\",\n" +
                    "      \"city\": \"Whitmore\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Kym\",\n" +
                    "      \"city\": \"Hawaii\"},\n" +
                    "    {\n" +
                    "      \"name\": \"Jake\",\n" +
                    "      \"city\": \"Saratoga Springs\"}\n" +
                    "\n" +
                    "  ]\n" +
                    "}\n";
        });
    }
}
