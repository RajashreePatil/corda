package net.corda.core

import kotlin.annotation.AnnotationRetention.*
import kotlin.annotation.AnnotationTarget.*
import kotlin.annotation.Retention
import kotlin.annotation.Target

/**
 * This annotates a class or file that we want to include into the deterministic version of Corda Core.
 * We don't expect everything within that class/file to be deterministic; those non-deterministic
 * elements need to be annotated with either [DeleteForDJVM] or [StubOutForDJVM] so that they
 * can be deleted.
 */
// DOCSTART 01
@Target(FILE, CLASS)
@Retention(BINARY)
@CordaInternal
annotation class KeepForDJVM
// DOCEND 01