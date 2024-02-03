import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main
{
   public static void main(String[] args)
   {
//      Customer customer = new Customer();
//      double weeklyTransactions = customer.getWeeklyTransactions();
//      double weeklyRoundUp = weeklyTransactions.round() - weeklyTransactions;
//      Pot savingsGoal = new Pot();
//      savingsGoal.add(weeklyRoundUp);

      String accessToken = "eyJhbGciOiJQUzI1NiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAA" +
            "_21Ty5KcMAz8lRTn1dbA8L7llh_IB8iWmHEt2JRtZrOVyr_HYB7D1N7obrnVsszfRD" +
            "mXtAmOCogH8-482l7pm0D98S7NkLwlbhKhgrlJsa6uwFRfIOdGgCjSDmRVXxrM87Jg" +
            "GYr5z5i0aXUpr1WZZs1botBHIqubaiZQSjNp_8v0xPa3otU7rUUG4pp1kHdlBo3gC4" +
            "hUlKW8Ut0wB29vPljvJzLRFAJKopCmyBtoimsOMmWshKy7OpvThLF-SsnOHX3qWqZA" +
            "-SWDXNQVNBIRSq6JUu7EBYt5YGlGni8lJoX7EhU0DtxaRvrxIviv8UVQxNqrTrE987" +
            "1y_sSsgMiGkC2T8juIivco7wPvlZO_G6tc2BAoTeqhaMI-agJ71HJNItESSKO9NX30" +
            "nZlVM7pTdkCvjAbTQTdpWvvJyXkzbLF5QLWeHlATem6Je_a8w6VsYI8BYSsDnMUNLy" +
            "dH_GLepAhWkwiOIlAD3lbPqB2f4C1qh3LOvNPQGxmmP7wjAWa-hld2PWVNp_qtVex9" +
            "opYqy5LV6E_AnaVPq4K7w0dYhYObOXKcuHXUE7f4PDNxuC5c-zcWh_iN1yFGU3lnmn" +
            "omCGMfr8ax92HAaVzhiNszCb97eEXhMRlLT-3P7Nb3zH5zHsyn3nnPcwCQ7vFKjdRF" +
            "6nmnyypel5z8-w-KesPIoQQAAA.zhu71F8Xt1cbpNNs_HthMN4OGyUvSfG925Dd_UQ" +
            "Kt2Uci-Z19SqK5uBxFwZHRr__oXiZmzQX82NE-Ci3jLmQO0K_OsuLGmKPLQd3U19GB" +
            "PrtJfLoQCa7hNDNArKpDtxLWQfMzSNwTMsapRWLm4h19D6b88ViTKh7gZH9B0DjO8L" +
            "D3dfrw1URuCBa-ZUCqsqpKck7E8jHc1caoHNrp0NH6Jp6FqLDej7Jg8pQ9Yovk66qC" +
            "a2dfZnLPwaUskHs615fh94iOiTsP5U4LyIu617p8vltlh5kpkQAWBKyhX2LkpbWPLv" +
            "v8U0MT73wjYfodQMBC25b6NvSuhnxQZRT9xIsUF9EOLk7TxPu8RRWNzXicZ4tpQtbb" +
            "b4-VBrvYx-in0i_dnvZMgFKN6T4_2sth8jP1RerC-QqnyTzQiG7K7fWf_MHrxdLA_9" +
            "NKxzB893eHMIzwV3LMbENhWk2-uUboEHxuImms05k210U0Jq3t25DIn8Be7R_M_QxZ" +
            "whStajXOfl6fkGz0dOhqTHfrByz3Ugd9rWOgx35X9yvhCAYQEEvV01L5swlARPDOvJ" +
            "XU5D8hJK9hlJPt5Mm3--BuiMwMxVQ58IEfVFnOZ-N8raz8m4ahWAm3O6FrPJLR7tpG" +
            "ithPPcuZ9h9hwdYtq6Ij37LcIcNDvdwbjAEd9avp4fUGGzheMc";

      HttpClient client = HttpClient.newHttpClient();
      String baseUrl = "https://api-sandbox.starlingbank.com"; // Replace with actual API URL
      HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(baseUrl + "/endpoint")) // Replace "/endpoint" with actual endpoint
            .header("Authorization", "Bearer " + accessToken) // Replace accessToken with your variable
            .build();

      client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .thenAccept(System.out::println) // Replace with actual response handling logic
            .join();

   }
}