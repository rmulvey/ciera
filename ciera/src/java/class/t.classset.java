T_b("package ");
T_b(self->package);
T_b(";");
T_b("\n");
T_b(imports);
T_b("\n");
T_b("public class ");
T_b(self->name);
T_b(" extends ");
T_b(self->extends);
T_b(" {");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(self->name);
T_b("() {");
T_b("\n");
T_b("        ");
T_b("super( ");
T_b(self->class_name);
T_b(".KEY_LETTERS );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("// selections");
T_b("\n");
T_b(selectors);
T_b("\n");
T_b("}");
T_b("\n");