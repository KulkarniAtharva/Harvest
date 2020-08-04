package dev.atharvakulkarni.harvest;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Add_students extends Fragment
{
    Button add;
    EditText name,division,year;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.add_students,container,false);

        add = view.findViewById(R.id.add_student);
        name = view.findViewById(R.id.student_name);
        year = view.findViewById(R.id.student_year);
        division = view.findViewById(R.id.student_division);

        /*add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(false);

                final AlertDialog alertDialog = builder.create();
                LayoutInflater inflater1 = getLayoutInflater();

                View dialogLayout = inflater1.inflate(R.layout.add_students_dialog,null);
                alertDialog.setView(dialogLayout);
                alertDialog.show();

                Button add = dialogLayout.findViewById(R.id.add);
                Button cancel = dialogLayout.findViewById(R.id.cancel);

                add.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                    }
                });

                cancel.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        alertDialog.cancel();
                    }
                });
            }
        });*/

        return view;
    }
}