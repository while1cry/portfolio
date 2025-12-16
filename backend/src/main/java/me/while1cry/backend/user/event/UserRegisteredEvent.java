package me.while1cry.backend.user.event;

public record UserRegisteredEvent(Long userId, String email) {
}
