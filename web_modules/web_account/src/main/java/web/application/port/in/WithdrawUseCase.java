package web.application.port.in;

import web.application.dto.CommandBalanceDTO;

public interface WithdrawUseCase {
    String withdraw(CommandBalanceDTO commandBalanceDTO);
}
