package optimize.optimizemod;

/**
 * Replacement for the original SystemUtil implementation that removed the
 * invasive HWID validation. The original class relied on remote checks that
 * prevented the mod from launching on unrecognised machines. To keep the rest
 * of the client functional while stripping the HWID lock we provide a very
 * small shim that simply exposes the same API surface expected by the
 * precompiled classes that ship with the project.
 */
public final class SystemUtil {

    private SystemUtil() {
        // Utility class
    }

    /**
     * Returns a stable identifier for this client instance. The legacy build
     * attempted to gather multiple system properties, hash them and then
     * compare the result with a server-side white-list. Because the HWID gate
     * is no longer required we expose a deterministic but non-identifying
     * token. Existing bytecode only cares about the value being non-null, so a
     * static constant keeps behaviour consistent without triggering the old
     * lock-out logic.
     *
     * @return constant identifier string that bypasses the HWID restriction.
     */
    public static String getSystemInfo() {
        return "generic-client";
    }
}
