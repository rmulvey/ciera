T_b("package ");
T_b(self->package);
T_b(";");
T_b("\n");
T_b(imports);
T_b("\n");
T_b("public interface ");
T_b(self->name);
T_b(" {");
T_b("\n");
T_b("    ");
T_b("// to provider messages");
T_b("\n");
T_b(to_provider_message_block);
T_b("\n");
T_b("    ");
T_b("// from provider messages");
T_b("\n");
T_b(from_provider_message_block);
T_b("\n");
T_b("}");
T_b("\n");