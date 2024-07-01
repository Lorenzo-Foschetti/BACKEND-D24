package lorenzofoschetti.u5d11.payloads;

import lorenzofoschetti.u5d11.enums.State;
import lorenzofoschetti.u5d11.enums.Type;

import java.util.UUID;

public record NewDispositivoPayload(
        Type type,
        State state,
        UUID dipendenteId
) {
}

