package com.eazybytes.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    @Override
    @NonNull
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }
}
