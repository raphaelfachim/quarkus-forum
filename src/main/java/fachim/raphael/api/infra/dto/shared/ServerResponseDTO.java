package fachim.raphael.api.infra.dto.shared;

public class ServerResponseDTO {

    public static HttpError getError(int errorNo, String message) {
        return new HttpError(errorNo, message);
    }


    private static class HttpError {
        int errorNo;

        String message;

        public HttpError(int errorNo, String message) {
            this.errorNo = errorNo;
            this.message = message;
        }
    }
}
