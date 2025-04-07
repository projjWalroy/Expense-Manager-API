package com.projjwalroy.ExpenseTrackerAPI.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BlackListService {

    private final Set<String> blacklist = new HashSet<>();

    public boolean isTokenBlacklisted(String token)
    {
        return blacklist.contains(token);
    }

    public void addTokenToBlacklist(String jwtToken)
    {
        blacklist.add(jwtToken);
    }
}
