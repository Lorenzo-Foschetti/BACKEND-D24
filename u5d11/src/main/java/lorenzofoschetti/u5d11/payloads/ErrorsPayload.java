package lorenzofoschetti.u5d11.payloads;


import java.time.LocalDateTime;

public record ErrorsPayload(String message, LocalDateTime errorTime) {
}

